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

public val OutlineGroup.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.2402f, 16.75f)
                curveTo(9.6202f, 16.75f, 7.4902f, 14.62f, 7.4902f, 12.0f)
                curveTo(7.4902f, 9.38f, 9.6202f, 7.25f, 12.2402f, 7.25f)
                curveTo(13.3902f, 7.25f, 14.5102f, 7.67f, 15.3702f, 8.44f)
                curveTo(15.6802f, 8.71f, 15.7102f, 9.19f, 15.4402f, 9.5f)
                curveTo(15.1702f, 9.81f, 14.6902f, 9.84f, 14.3802f, 9.57f)
                curveTo(13.7902f, 9.05f, 13.0302f, 8.76f, 12.2402f, 8.76f)
                curveTo(10.4502f, 8.76f, 8.9902f, 10.22f, 8.9902f, 12.01f)
                curveTo(8.9902f, 13.8f, 10.4502f, 15.26f, 12.2402f, 15.26f)
                curveTo(13.0202f, 15.26f, 13.7902f, 14.97f, 14.3802f, 14.45f)
                curveTo(14.6902f, 14.18f, 15.1702f, 14.21f, 15.4402f, 14.52f)
                curveTo(15.7102f, 14.83f, 15.6802f, 15.31f, 15.3702f, 15.58f)
                curveTo(14.5002f, 16.33f, 13.3902f, 16.75f, 12.2402f, 16.75f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
