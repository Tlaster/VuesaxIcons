package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.75f)
                curveTo(7.86f, 15.75f, 4.5f, 12.5f, 4.5f, 8.5f)
                curveTo(4.5f, 4.5f, 7.86f, 1.25f, 12.0f, 1.25f)
                curveTo(16.14f, 1.25f, 19.5f, 4.5f, 19.5f, 8.5f)
                curveTo(19.5f, 12.5f, 16.14f, 15.75f, 12.0f, 15.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.69f, 2.75f, 6.0f, 5.33f, 6.0f, 8.5f)
                curveTo(6.0f, 11.67f, 8.69f, 14.25f, 12.0f, 14.25f)
                curveTo(15.31f, 14.25f, 18.0f, 11.67f, 18.0f, 8.5f)
                curveTo(18.0f, 5.33f, 15.31f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.62f, 22.7501f)
                curveTo(15.34f, 22.7501f, 15.06f, 22.6801f, 14.77f, 22.5501f)
                lineTo(12.08f, 21.2801f)
                curveTo(12.05f, 21.2701f, 11.94f, 21.2701f, 11.9f, 21.2801f)
                lineTo(9.23f, 22.5401f)
                curveTo(8.64f, 22.8201f, 8.02f, 22.8101f, 7.54f, 22.5001f)
                curveTo(7.04f, 22.1801f, 6.75f, 21.5901f, 6.76f, 20.8901f)
                lineTo(6.77f, 13.5101f)
                curveTo(6.77f, 13.1001f, 7.09f, 12.7401f, 7.52f, 12.7601f)
                curveTo(7.93f, 12.7601f, 8.27f, 13.1001f, 8.27f, 13.5101f)
                lineTo(8.26f, 20.8901f)
                curveTo(8.26f, 21.1101f, 8.32f, 21.2201f, 8.35f, 21.2301f)
                curveTo(8.37f, 21.2401f, 8.46f, 21.2501f, 8.6f, 21.1801f)
                lineTo(11.28f, 19.9101f)
                curveTo(11.71f, 19.7101f, 12.3f, 19.7101f, 12.73f, 19.9101f)
                lineTo(15.42f, 21.1801f)
                curveTo(15.56f, 21.2501f, 15.65f, 21.2401f, 15.67f, 21.2301f)
                curveTo(15.7f, 21.2101f, 15.76f, 21.1001f, 15.76f, 20.8901f)
                verticalLineTo(13.3301f)
                curveTo(15.76f, 12.9201f, 16.1f, 12.5801f, 16.51f, 12.5801f)
                curveTo(16.92f, 12.5801f, 17.26f, 12.9201f, 17.26f, 13.3301f)
                verticalLineTo(20.8901f)
                curveTo(17.26f, 21.6001f, 16.97f, 22.1801f, 16.47f, 22.5001f)
                curveTo(16.21f, 22.6701f, 15.92f, 22.7501f, 15.62f, 22.7501f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
