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

public val BoldGroup.Document: ImageVector
    get() {
        if (_document != null) {
            return _document!!
        }
        _document = Builder(name = "Document", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(15.75f, 15.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 15.75f, 7.5f, 15.41f, 7.5f, 15.0f)
                curveTo(7.5f, 14.59f, 7.84f, 14.25f, 8.25f, 14.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 14.25f, 16.5f, 14.59f, 16.5f, 15.0f)
                curveTo(16.5f, 15.41f, 16.16f, 15.75f, 15.75f, 15.75f)
                close()
                moveTo(15.75f, 9.75f)
                horizontalLineTo(8.25f)
                curveTo(7.84f, 9.75f, 7.5f, 9.41f, 7.5f, 9.0f)
                curveTo(7.5f, 8.59f, 7.84f, 8.25f, 8.25f, 8.25f)
                horizontalLineTo(15.75f)
                curveTo(16.16f, 8.25f, 16.5f, 8.59f, 16.5f, 9.0f)
                curveTo(16.5f, 9.41f, 16.16f, 9.75f, 15.75f, 9.75f)
                close()
            }
        }
        .build()
        return _document!!
    }

private var _document: ImageVector? = null
