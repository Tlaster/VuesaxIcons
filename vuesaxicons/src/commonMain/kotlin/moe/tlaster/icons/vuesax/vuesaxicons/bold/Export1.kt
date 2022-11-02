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

public val BoldGroup.Export1: ImageVector
    get() {
        if (_export1 != null) {
            return _export1!!
        }
        _export1 = Builder(name = "Export1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f)
                curveTo(2.0f, 17.52f, 6.48f, 22.0f, 12.0f, 22.0f)
                curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f)
                curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.25f, 12.33f)
                curveTo(17.25f, 12.74f, 16.91f, 13.08f, 16.5f, 13.08f)
                curveTo(16.09f, 13.08f, 15.75f, 12.74f, 15.75f, 12.33f)
                verticalLineTo(9.31f)
                lineTo(8.03f, 17.03f)
                curveTo(7.88f, 17.18f, 7.69f, 17.25f, 7.5f, 17.25f)
                curveTo(7.31f, 17.25f, 7.12f, 17.18f, 6.97f, 17.03f)
                curveTo(6.68f, 16.74f, 6.68f, 16.26f, 6.97f, 15.97f)
                lineTo(14.69f, 8.25f)
                horizontalLineTo(11.67f)
                curveTo(11.26f, 8.25f, 10.92f, 7.91f, 10.92f, 7.5f)
                curveTo(10.92f, 7.09f, 11.26f, 6.75f, 11.67f, 6.75f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 6.75f, 17.25f, 7.09f, 17.25f, 7.5f)
                verticalLineTo(12.33f)
                close()
            }
        }
        .build()
        return _export1!!
    }

private var _export1: ImageVector? = null
