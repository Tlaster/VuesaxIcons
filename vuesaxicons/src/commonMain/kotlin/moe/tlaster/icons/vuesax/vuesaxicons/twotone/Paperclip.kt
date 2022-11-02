package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 12.0f)
                verticalLineTo(15.5f)
                curveTo(11.9707f, 17.43f, 13.5407f, 19.0f, 15.4707f, 19.0f)
                curveTo(17.4007f, 19.0f, 18.9707f, 17.43f, 18.9707f, 15.5f)
                verticalLineTo(10.0f)
                curveTo(18.9707f, 6.13f, 15.8407f, 3.0f, 11.9707f, 3.0f)
                curveTo(8.1007f, 3.0f, 4.9707f, 6.13f, 4.9707f, 10.0f)
                verticalLineTo(16.0f)
                curveTo(4.9707f, 19.31f, 7.6607f, 22.0f, 10.9707f, 22.0f)
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
