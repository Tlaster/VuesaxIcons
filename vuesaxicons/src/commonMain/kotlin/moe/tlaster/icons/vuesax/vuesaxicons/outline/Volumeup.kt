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

public val OutlineGroup.Volumeup: ImageVector
    get() {
        if (_volumeup != null) {
            return _volumeup!!
        }
        _volumeup = Builder(name = "Volumeup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.76f, 20.75f)
                curveTo(11.95f, 20.75f, 11.08f, 20.47f, 10.18f, 19.91f)
                lineTo(7.2f, 18.05f)
                curveTo(6.99f, 17.92f, 6.76f, 17.85f, 6.52f, 17.85f)
                horizontalLineTo(5.06f)
                curveTo(2.6f, 17.85f, 1.25f, 16.5f, 1.25f, 14.04f)
                verticalLineTo(9.96f)
                curveTo(1.25f, 7.5f, 2.6f, 6.15f, 5.06f, 6.15f)
                horizontalLineTo(6.52f)
                curveTo(6.76f, 6.15f, 7.0f, 6.08f, 7.2f, 5.95f)
                lineTo(10.18f, 4.09f)
                curveTo(11.67f, 3.16f, 13.11f, 2.99f, 14.25f, 3.63f)
                curveTo(15.39f, 4.26f, 16.01f, 5.57f, 16.01f, 7.33f)
                verticalLineTo(16.69f)
                curveTo(16.01f, 18.44f, 15.38f, 19.76f, 14.25f, 20.39f)
                curveTo(13.8f, 20.63f, 13.3f, 20.75f, 12.76f, 20.75f)
                close()
                moveTo(5.06f, 7.65f)
                curveTo(3.44f, 7.65f, 2.75f, 8.34f, 2.75f, 9.96f)
                verticalLineTo(14.04f)
                curveTo(2.75f, 15.66f, 3.44f, 16.35f, 5.06f, 16.35f)
                horizontalLineTo(6.52f)
                curveTo(7.04f, 16.35f, 7.55f, 16.5f, 8.0f, 16.77f)
                lineTo(10.98f, 18.63f)
                curveTo(11.97f, 19.25f, 12.9f, 19.4f, 13.53f, 19.06f)
                curveTo(14.16f, 18.71f, 14.52f, 17.84f, 14.52f, 16.68f)
                verticalLineTo(7.32f)
                curveTo(14.52f, 6.15f, 14.16f, 5.28f, 13.53f, 4.94f)
                curveTo(12.9f, 4.59f, 11.97f, 4.75f, 10.98f, 5.37f)
                lineTo(8.0f, 7.22f)
                curveTo(7.55f, 7.5f, 7.04f, 7.65f, 6.52f, 7.65f)
                horizontalLineTo(5.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.75f)
                horizontalLineTo(18.0f)
                curveTo(17.59f, 12.75f, 17.25f, 12.41f, 17.25f, 12.0f)
                curveTo(17.25f, 11.59f, 17.59f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.41f, 11.25f, 22.75f, 11.59f, 22.75f, 12.0f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22.0f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.75f)
                curveTo(19.59f, 14.75f, 19.25f, 14.41f, 19.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(19.25f, 9.59f, 19.59f, 9.25f, 20.0f, 9.25f)
                curveTo(20.41f, 9.25f, 20.75f, 9.59f, 20.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(20.75f, 14.41f, 20.41f, 14.75f, 20.0f, 14.75f)
                close()
            }
        }
        .build()
        return _volumeup!!
    }

private var _volumeup: ImageVector? = null
