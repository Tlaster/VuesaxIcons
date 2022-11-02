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

public val OutlineGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5002f, 18.25f)
                horizontalLineTo(14.9902f)
                curveTo(14.5802f, 18.25f, 14.2402f, 17.91f, 14.2402f, 17.5f)
                curveTo(14.2402f, 17.09f, 14.5802f, 16.75f, 14.9902f, 16.75f)
                horizontalLineTo(16.5002f)
                curveTo(19.1202f, 16.75f, 21.2502f, 14.62f, 21.2502f, 12.0f)
                curveTo(21.2502f, 9.38f, 19.1202f, 7.25f, 16.5002f, 7.25f)
                horizontalLineTo(15.0002f)
                curveTo(14.5902f, 7.25f, 14.2502f, 6.91f, 14.2502f, 6.5f)
                curveTo(14.2502f, 6.09f, 14.5802f, 5.75f, 15.0002f, 5.75f)
                horizontalLineTo(16.5002f)
                curveTo(19.9502f, 5.75f, 22.7502f, 8.55f, 22.7502f, 12.0f)
                curveTo(22.7502f, 15.45f, 19.9502f, 18.25f, 16.5002f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 18.25f)
                horizontalLineTo(7.5f)
                curveTo(4.05f, 18.25f, 1.25f, 15.45f, 1.25f, 12.0f)
                curveTo(1.25f, 8.55f, 4.05f, 5.75f, 7.5f, 5.75f)
                horizontalLineTo(9.0f)
                curveTo(9.41f, 5.75f, 9.75f, 6.09f, 9.75f, 6.5f)
                curveTo(9.75f, 6.91f, 9.41f, 7.25f, 9.0f, 7.25f)
                horizontalLineTo(7.5f)
                curveTo(4.88f, 7.25f, 2.75f, 9.38f, 2.75f, 12.0f)
                curveTo(2.75f, 14.62f, 4.88f, 16.75f, 7.5f, 16.75f)
                horizontalLineTo(9.0f)
                curveTo(9.41f, 16.75f, 9.75f, 17.09f, 9.75f, 17.5f)
                curveTo(9.75f, 17.91f, 9.41f, 18.25f, 9.0f, 18.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 12.75f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 12.75f, 7.25f, 12.41f, 7.25f, 12.0f)
                curveTo(7.25f, 11.59f, 7.59f, 11.25f, 8.0f, 11.25f)
                horizontalLineTo(16.0f)
                curveTo(16.41f, 11.25f, 16.75f, 11.59f, 16.75f, 12.0f)
                curveTo(16.75f, 12.41f, 16.41f, 12.75f, 16.0f, 12.75f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
