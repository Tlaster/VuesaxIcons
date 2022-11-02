package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Flash1: ImageVector
    get() {
        if (_flash1 != null) {
            return _flash1!!
        }
        _flash1 = Builder(name = "Flash1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.09f, 13.28f)
                horizontalLineTo(9.18f)
                verticalLineTo(20.48f)
                curveTo(9.18f, 22.16f, 10.09f, 22.5f, 11.2f, 21.24f)
                lineTo(18.77f, 12.64f)
                curveTo(19.7f, 11.59f, 19.31f, 10.72f, 17.9f, 10.72f)
                horizontalLineTo(14.81f)
                verticalLineTo(3.52f)
                curveTo(14.81f, 1.84f, 13.9f, 1.5f, 12.79f, 2.76f)
                lineTo(5.22f, 11.36f)
                curveTo(4.3f, 12.42f, 4.69f, 13.28f, 6.09f, 13.28f)
                close()
            }
        }
        .build()
        return _flash1!!
    }

private var _flash1: ImageVector? = null
