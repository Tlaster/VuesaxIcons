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

public val LinearGroup.Mousesquare: ImageVector
    get() {
        if (_mousesquare != null) {
            return _mousesquare!!
        }
        _mousesquare = Builder(name = "Mousesquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 4.0f, 20.0f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 2.0f, 2.0f, 4.0f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 20.0f, 4.0f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.96f, 17.84f)
                lineTo(19.33f, 18.39f)
                curveTo(18.88f, 18.54f, 18.52f, 18.89f, 18.37f, 19.35f)
                lineTo(17.82f, 20.98f)
                curveTo(17.35f, 22.39f, 15.37f, 22.36f, 14.93f, 20.95f)
                lineTo(13.08f, 15.0f)
                curveTo(12.72f, 13.82f, 13.81f, 12.72f, 14.98f, 13.09f)
                lineTo(20.94f, 14.94f)
                curveTo(22.34f, 15.38f, 22.36f, 17.37f, 20.96f, 17.84f)
                close()
            }
        }
        .build()
        return _mousesquare!!
    }

private var _mousesquare: ImageVector? = null
