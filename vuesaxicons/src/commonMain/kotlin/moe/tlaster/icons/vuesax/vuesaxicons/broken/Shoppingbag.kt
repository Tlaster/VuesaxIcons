package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Shoppingbag: ImageVector
    get() {
        if (_shoppingbag != null) {
            return _shoppingbag!!
        }
        _shoppingbag = Builder(name = "Shoppingbag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.4108f, 17.03f)
                horizontalLineTo(3.6208f)
                lineTo(3.5308f, 17.53f)
                curveTo(3.2408f, 19.99f, 4.0008f, 22.0f, 7.5008f, 22.0f)
                horizontalLineTo(16.4908f)
                curveTo(20.0008f, 22.0f, 20.7608f, 19.99f, 20.4608f, 17.53f)
                lineTo(19.5608f, 10.03f)
                curveTo(19.3308f, 8.09f, 18.9908f, 6.5f, 15.5908f, 6.5f)
                horizontalLineTo(8.3908f)
                curveTo(4.9908f, 6.5f, 4.6508f, 8.09f, 4.4208f, 10.03f)
                lineTo(4.1009f, 12.7f)
                lineTo(4.0108f, 13.43f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 3.0f, 9.0f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(13.5f)
                curveTo(15.0f, 2.0f, 16.0f, 3.0f, 16.0f, 4.5f)
                verticalLineTo(8.0f)
            }
        }
        .build()
        return _shoppingbag!!
    }

private var _shoppingbag: ImageVector? = null
