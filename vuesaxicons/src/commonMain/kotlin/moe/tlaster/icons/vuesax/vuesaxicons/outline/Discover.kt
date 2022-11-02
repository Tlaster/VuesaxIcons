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

public val OutlineGroup.Discover: ImageVector
    get() {
        if (_discover != null) {
            return _discover!!
        }
        _discover = Builder(name = "Discover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(10.5f, 16.75f)
                curveTo(8.71f, 16.75f, 7.25f, 15.29f, 7.25f, 13.5f)
                curveTo(7.25f, 10.05f, 10.05f, 7.25f, 13.5f, 7.25f)
                curveTo(15.29f, 7.25f, 16.75f, 8.71f, 16.75f, 10.5f)
                curveTo(16.75f, 13.95f, 13.95f, 16.75f, 10.5f, 16.75f)
                close()
                moveTo(13.5f, 8.75f)
                curveTo(10.88f, 8.75f, 8.75f, 10.88f, 8.75f, 13.5f)
                curveTo(8.75f, 14.46f, 9.54f, 15.25f, 10.5f, 15.25f)
                curveTo(13.12f, 15.25f, 15.25f, 13.12f, 15.25f, 10.5f)
                curveTo(15.25f, 9.54f, 14.46f, 8.75f, 13.5f, 8.75f)
                close()
            }
        }
        .build()
        return _discover!!
    }

private var _discover: ImageVector? = null
