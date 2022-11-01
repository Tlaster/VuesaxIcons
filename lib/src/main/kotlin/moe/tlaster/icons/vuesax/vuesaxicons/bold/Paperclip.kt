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

public val BoldGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.19f, 2.0f)
                horizontalLineTo(7.81f)
                curveTo(4.17f, 2.0f, 2.0f, 4.17f, 2.0f, 7.81f)
                verticalLineTo(16.18f)
                curveTo(2.0f, 19.83f, 4.17f, 22.0f, 7.81f, 22.0f)
                horizontalLineTo(16.18f)
                curveTo(19.82f, 22.0f, 21.99f, 19.83f, 21.99f, 16.19f)
                verticalLineTo(7.81f)
                curveTo(22.0f, 4.17f, 19.83f, 2.0f, 16.19f, 2.0f)
                close()
                moveTo(16.75f, 13.71f)
                curveTo(16.75f, 15.23f, 15.52f, 16.46f, 14.0f, 16.46f)
                curveTo(12.48f, 16.46f, 11.25f, 15.23f, 11.25f, 13.71f)
                verticalLineTo(11.71f)
                curveTo(11.25f, 11.3f, 11.59f, 10.96f, 12.0f, 10.96f)
                curveTo(12.41f, 10.96f, 12.75f, 11.3f, 12.75f, 11.71f)
                verticalLineTo(13.71f)
                curveTo(12.75f, 14.4f, 13.31f, 14.96f, 14.0f, 14.96f)
                curveTo(14.69f, 14.96f, 15.25f, 14.4f, 15.25f, 13.71f)
                verticalLineTo(10.57f)
                curveTo(15.25f, 8.78f, 13.79f, 7.32f, 12.0f, 7.32f)
                curveTo(10.21f, 7.32f, 8.75f, 8.78f, 8.75f, 10.57f)
                verticalLineTo(14.0f)
                curveTo(8.75f, 15.48f, 9.95f, 16.68f, 11.43f, 16.68f)
                curveTo(11.84f, 16.68f, 12.18f, 17.02f, 12.18f, 17.43f)
                curveTo(12.18f, 17.84f, 11.84f, 18.18f, 11.43f, 18.18f)
                curveTo(9.13f, 18.18f, 7.25f, 16.3f, 7.25f, 14.0f)
                verticalLineTo(10.57f)
                curveTo(7.25f, 7.95f, 9.38f, 5.82f, 12.0f, 5.82f)
                curveTo(14.62f, 5.82f, 16.75f, 7.95f, 16.75f, 10.57f)
                verticalLineTo(13.71f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
