package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Dent: ImageVector
    get() {
        if (_dent != null) {
            return _dent!!
        }
        _dent = Builder(name = "Dent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.38f, 12.43f)
                lineTo(16.84f, 13.27f)
                curveTo(17.47f, 13.63f, 17.68f, 14.44f, 17.32f, 15.07f)
                curveTo(16.96f, 15.7f, 16.15f, 15.91f, 15.52f, 15.55f)
                lineTo(14.06f, 14.71f)
                curveTo(13.73f, 14.52f, 13.31f, 14.76f, 13.31f, 15.14f)
                verticalLineTo(16.82f)
                curveTo(13.31f, 17.54f, 12.72f, 18.14f, 11.99f, 18.14f)
                curveTo(11.26f, 18.14f, 10.67f, 17.55f, 10.67f, 16.82f)
                verticalLineTo(15.14f)
                curveTo(10.67f, 14.76f, 10.25f, 14.51f, 9.92f, 14.71f)
                lineTo(8.46f, 15.55f)
                curveTo(7.83f, 15.91f, 7.02f, 15.7f, 6.66f, 15.07f)
                curveTo(6.3f, 14.44f, 6.51f, 13.63f, 7.14f, 13.27f)
                lineTo(8.6f, 12.43f)
                curveTo(8.93f, 12.24f, 8.93f, 11.76f, 8.6f, 11.56f)
                lineTo(7.14f, 10.72f)
                curveTo(6.51f, 10.36f, 6.3f, 9.55f, 6.66f, 8.92f)
                curveTo(7.02f, 8.29f, 7.83f, 8.08f, 8.46f, 8.44f)
                lineTo(9.92f, 9.28f)
                curveTo(10.25f, 9.47f, 10.67f, 9.23f, 10.67f, 8.85f)
                verticalLineTo(7.17f)
                curveTo(10.67f, 6.45f, 11.26f, 5.85f, 11.99f, 5.85f)
                curveTo(12.72f, 5.85f, 13.31f, 6.44f, 13.31f, 7.17f)
                verticalLineTo(8.85f)
                curveTo(13.31f, 9.23f, 13.73f, 9.48f, 14.06f, 9.28f)
                lineTo(15.52f, 8.44f)
                curveTo(16.15f, 8.08f, 16.96f, 8.29f, 17.32f, 8.92f)
                curveTo(17.68f, 9.55f, 17.47f, 10.36f, 16.84f, 10.72f)
                lineTo(15.38f, 11.56f)
                curveTo(15.05f, 11.76f, 15.05f, 12.24f, 15.38f, 12.43f)
                close()
            }
        }
        .build()
        return _dent!!
    }

private var _dent: ImageVector? = null
