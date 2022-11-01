package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Transactionminus: ImageVector
    get() {
        if (_transactionminus != null) {
            return _transactionminus!!
        }
        _transactionminus = Builder(name = "Transactionminus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7283f, 19.7f)
                curveTo(7.5483f, 18.82f, 8.7983f, 18.89f, 9.5183f, 19.85f)
                lineTo(10.5283f, 21.2f)
                curveTo(11.3383f, 22.27f, 12.6483f, 22.27f, 13.4583f, 21.2f)
                lineTo(14.4683f, 19.85f)
                curveTo(15.1883f, 18.89f, 16.4383f, 18.82f, 17.2583f, 19.7f)
                curveTo(19.0383f, 21.6f, 20.4883f, 20.97f, 20.4883f, 18.31f)
                verticalLineTo(7.04f)
                curveTo(20.4883f, 3.01f, 19.5483f, 2.0f, 15.7683f, 2.0f)
                horizontalLineTo(8.2083f)
                curveTo(4.4283f, 2.0f, 3.4883f, 3.01f, 3.4883f, 7.04f)
                verticalLineTo(18.3f)
                curveTo(3.4983f, 20.97f, 4.9583f, 21.59f, 6.7283f, 19.7f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.25f, 10.0f)
                horizontalLineTo(14.75f)
            }
        }
        .build()
        return _transactionminus!!
    }

private var _transactionminus: ImageVector? = null
