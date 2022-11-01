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

public val BoldGroup.`Import-3`: ImageVector
    get() {
        if (`_import-3` != null) {
            return `_import-3`!!
        }
        `_import-3` = Builder(name = "Import-3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(17.53f, 7.53f)
                lineTo(9.81f, 15.25f)
                horizontalLineTo(12.83f)
                curveTo(13.24f, 15.25f, 13.58f, 15.59f, 13.58f, 16.0f)
                curveTo(13.58f, 16.41f, 13.24f, 16.75f, 12.83f, 16.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 16.75f, 7.25f, 16.41f, 7.25f, 16.0f)
                verticalLineTo(11.17f)
                curveTo(7.25f, 10.76f, 7.59f, 10.42f, 8.0f, 10.42f)
                curveTo(8.41f, 10.42f, 8.75f, 10.76f, 8.75f, 11.17f)
                verticalLineTo(14.19f)
                lineTo(16.47f, 6.47f)
                curveTo(16.62f, 6.32f, 16.81f, 6.25f, 17.0f, 6.25f)
                curveTo(17.19f, 6.25f, 17.38f, 6.32f, 17.53f, 6.47f)
                curveTo(17.82f, 6.76f, 17.82f, 7.24f, 17.53f, 7.53f)
                close()
            }
        }
        .build()
        return `_import-3`!!
    }

private var `_import-3`: ImageVector? = null
