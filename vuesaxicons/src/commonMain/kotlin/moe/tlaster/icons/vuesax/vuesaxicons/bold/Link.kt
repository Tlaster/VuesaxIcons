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
                moveTo(12.5f, 14.75f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 14.75f, 9.25f, 14.41f, 9.25f, 14.0f)
                curveTo(9.25f, 13.59f, 9.59f, 13.25f, 10.0f, 13.25f)
                horizontalLineTo(12.5f)
                curveTo(15.12f, 13.25f, 17.25f, 11.12f, 17.25f, 8.5f)
                curveTo(17.25f, 5.88f, 15.12f, 3.75f, 12.5f, 3.75f)
                horizontalLineTo(7.5f)
                curveTo(4.88f, 3.75f, 2.75f, 5.88f, 2.75f, 8.5f)
                curveTo(2.75f, 9.6f, 3.14f, 10.67f, 3.84f, 11.52f)
                curveTo(4.1f, 11.84f, 4.06f, 12.31f, 3.74f, 12.58f)
                curveTo(3.42f, 12.84f, 2.95f, 12.8f, 2.68f, 12.48f)
                curveTo(1.76f, 11.36f, 1.25f, 9.95f, 1.25f, 8.5f)
                curveTo(1.25f, 5.05f, 4.05f, 2.25f, 7.5f, 2.25f)
                horizontalLineTo(12.5f)
                curveTo(15.95f, 2.25f, 18.75f, 5.05f, 18.75f, 8.5f)
                curveTo(18.75f, 11.95f, 15.95f, 14.75f, 12.5f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 21.75f)
                horizontalLineTo(11.5f)
                curveTo(8.05f, 21.75f, 5.25f, 18.95f, 5.25f, 15.5f)
                curveTo(5.25f, 12.05f, 8.05f, 9.25f, 11.5f, 9.25f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 9.25f, 14.75f, 9.59f, 14.75f, 10.0f)
                curveTo(14.75f, 10.41f, 14.41f, 10.75f, 14.0f, 10.75f)
                horizontalLineTo(11.5f)
                curveTo(8.88f, 10.75f, 6.75f, 12.88f, 6.75f, 15.5f)
                curveTo(6.75f, 18.12f, 8.88f, 20.25f, 11.5f, 20.25f)
                horizontalLineTo(16.5f)
                curveTo(19.12f, 20.25f, 21.25f, 18.12f, 21.25f, 15.5f)
                curveTo(21.25f, 14.4f, 20.86f, 13.33f, 20.16f, 12.48f)
                curveTo(19.9f, 12.16f, 19.94f, 11.69f, 20.26f, 11.42f)
                curveTo(20.58f, 11.15f, 21.05f, 11.2f, 21.32f, 11.52f)
                curveTo(22.25f, 12.64f, 22.76f, 14.05f, 22.76f, 15.5f)
                curveTo(22.75f, 18.95f, 19.95f, 21.75f, 16.5f, 21.75f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
