package moe.tlaster.icons.vuesax.vuesaxicons.bold

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
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2499f, 12.0f)
                curveTo(7.2499f, 11.59f, 7.5899f, 11.25f, 7.9999f, 11.25f)
                horizontalLineTo(10.9999f)
                verticalLineTo(7.5f)
                curveTo(10.9999f, 6.95f, 10.5499f, 6.5f, 9.9999f, 6.5f)
                horizontalLineTo(7.7699f)
                curveTo(4.6199f, 6.5f, 1.8799f, 9.08f, 1.9999f, 12.22f)
                curveTo(2.0599f, 13.65f, 2.6599f, 14.94f, 3.6099f, 15.89f)
                curveTo(4.6099f, 16.88f, 5.9799f, 17.5f, 7.4999f, 17.5f)
                horizontalLineTo(9.9999f)
                curveTo(10.5499f, 17.5f, 10.9999f, 17.05f, 10.9999f, 16.5f)
                verticalLineTo(12.75f)
                horizontalLineTo(7.9999f)
                curveTo(7.5899f, 12.75f, 7.2499f, 12.41f, 7.2499f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.39f, 8.11f)
                curveTo(19.39f, 7.12f, 18.02f, 6.5f, 16.5f, 6.5f)
                horizontalLineTo(14.0f)
                curveTo(13.45f, 6.5f, 13.0f, 6.95f, 13.0f, 7.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12.0f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16.0f, 12.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 17.05f, 13.45f, 17.5f, 14.0f, 17.5f)
                horizontalLineTo(16.23f)
                curveTo(19.38f, 17.5f, 22.12f, 14.92f, 21.99f, 11.78f)
                curveTo(21.94f, 10.35f, 21.33f, 9.06f, 20.39f, 8.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
