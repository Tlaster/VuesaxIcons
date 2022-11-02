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

public val OutlineGroup.Infocircle: ImageVector
    get() {
        if (_infocircle != null) {
            return _infocircle!!
        }
        _infocircle = Builder(name = "Infocircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.75f)
                curveTo(11.59f, 13.75f, 11.25f, 13.41f, 11.25f, 13.0f)
                verticalLineTo(8.0f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12.0f, 7.25f)
                curveTo(12.41f, 7.25f, 12.75f, 7.59f, 12.75f, 8.0f)
                verticalLineTo(13.0f)
                curveTo(12.75f, 13.41f, 12.41f, 13.75f, 12.0f, 13.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.9999f)
                curveTo(11.87f, 16.9999f, 11.74f, 16.9699f, 11.62f, 16.9199f)
                curveTo(11.5f, 16.8699f, 11.39f, 16.7999f, 11.29f, 16.7099f)
                curveTo(11.2f, 16.6099f, 11.13f, 16.5099f, 11.08f, 16.3799f)
                curveTo(11.03f, 16.2599f, 11.0f, 16.1299f, 11.0f, 15.9999f)
                curveTo(11.0f, 15.8699f, 11.03f, 15.7399f, 11.08f, 15.6199f)
                curveTo(11.13f, 15.4999f, 11.2f, 15.3899f, 11.29f, 15.2899f)
                curveTo(11.39f, 15.1999f, 11.5f, 15.1299f, 11.62f, 15.0799f)
                curveTo(11.86f, 14.9799f, 12.14f, 14.9799f, 12.38f, 15.0799f)
                curveTo(12.5f, 15.1299f, 12.61f, 15.1999f, 12.71f, 15.2899f)
                curveTo(12.8f, 15.3899f, 12.87f, 15.4999f, 12.92f, 15.6199f)
                curveTo(12.97f, 15.7399f, 13.0f, 15.8699f, 13.0f, 15.9999f)
                curveTo(13.0f, 16.1299f, 12.97f, 16.2599f, 12.92f, 16.3799f)
                curveTo(12.87f, 16.5099f, 12.8f, 16.6099f, 12.71f, 16.7099f)
                curveTo(12.61f, 16.7999f, 12.5f, 16.8699f, 12.38f, 16.9199f)
                curveTo(12.26f, 16.9699f, 12.13f, 16.9999f, 12.0f, 16.9999f)
                close()
            }
        }
        .build()
        return _infocircle!!
    }

private var _infocircle: ImageVector? = null
