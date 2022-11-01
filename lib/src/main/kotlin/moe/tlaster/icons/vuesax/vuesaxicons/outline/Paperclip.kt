package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9707f, 22.75f)
                curveTo(7.2507f, 22.75f, 4.2207f, 19.72f, 4.2207f, 16.0f)
                verticalLineTo(10.0f)
                curveTo(4.2207f, 5.73f, 7.7007f, 2.25f, 11.9707f, 2.25f)
                curveTo(16.2407f, 2.25f, 19.7207f, 5.73f, 19.7207f, 10.0f)
                verticalLineTo(15.5f)
                curveTo(19.7207f, 17.84f, 17.8107f, 19.75f, 15.4707f, 19.75f)
                curveTo(13.1307f, 19.75f, 11.2207f, 17.84f, 11.2207f, 15.5f)
                verticalLineTo(12.0f)
                curveTo(11.2207f, 11.59f, 11.5607f, 11.25f, 11.9707f, 11.25f)
                curveTo(12.3807f, 11.25f, 12.7207f, 11.59f, 12.7207f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(12.7207f, 17.02f, 13.9507f, 18.25f, 15.4707f, 18.25f)
                curveTo(16.9907f, 18.25f, 18.2207f, 17.02f, 18.2207f, 15.5f)
                verticalLineTo(10.0f)
                curveTo(18.2207f, 6.55f, 15.4207f, 3.75f, 11.9707f, 3.75f)
                curveTo(8.5207f, 3.75f, 5.7207f, 6.55f, 5.7207f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(5.7207f, 18.89f, 8.0707f, 21.25f, 10.9707f, 21.25f)
                curveTo(11.3807f, 21.25f, 11.7207f, 21.59f, 11.7207f, 22.0f)
                curveTo(11.7207f, 22.41f, 11.3907f, 22.75f, 10.9707f, 22.75f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
