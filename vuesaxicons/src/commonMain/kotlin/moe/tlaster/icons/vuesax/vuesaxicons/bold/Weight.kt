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

public val BoldGroup.Weight: ImageVector
    get() {
        if (_weight != null) {
            return _weight!!
        }
        _weight = Builder(name = "Weight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.0f, 2.0f, 3.0f, 4.0f, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 20.0f, 5.0f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(19.0f, 22.0f, 21.0f, 20.0f, 21.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 4.0f, 19.0f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(17.57f, 8.48f)
                lineTo(15.39f, 11.98f)
                curveTo(15.33f, 12.07f, 15.23f, 12.14f, 15.13f, 12.15f)
                curveTo(15.11f, 12.15f, 15.09f, 12.15f, 15.08f, 12.15f)
                curveTo(14.99f, 12.15f, 14.9f, 12.12f, 14.83f, 12.06f)
                curveTo(13.22f, 10.63f, 10.8f, 10.63f, 9.19f, 12.06f)
                curveTo(9.11f, 12.13f, 9.0f, 12.17f, 8.89f, 12.15f)
                curveTo(8.78f, 12.13f, 8.68f, 12.07f, 8.63f, 11.98f)
                lineTo(6.45f, 8.48f)
                curveTo(6.33f, 8.33f, 6.36f, 8.13f, 6.5f, 8.0f)
                curveTo(9.63f, 5.21f, 14.36f, 5.21f, 17.5f, 8.0f)
                curveTo(17.64f, 8.13f, 17.67f, 8.33f, 17.57f, 8.48f)
                close()
            }
        }
        .build()
        return _weight!!
    }

private var _weight: ImageVector? = null
