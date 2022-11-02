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

public val OutlineGroup.Mobile: ImageVector
    get() {
        if (_mobile != null) {
            return _mobile!!
        }
        _mobile = Builder(name = "Mobile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 22.75f)
                horizontalLineTo(9.0f)
                curveTo(4.59f, 22.75f, 3.25f, 21.41f, 3.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(3.25f, 2.59f, 4.59f, 1.25f, 9.0f, 1.25f)
                horizontalLineTo(15.0f)
                curveTo(19.41f, 1.25f, 20.75f, 2.59f, 20.75f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(20.75f, 21.41f, 19.41f, 22.75f, 15.0f, 22.75f)
                close()
                moveTo(9.0f, 2.75f)
                curveTo(5.42f, 2.75f, 4.75f, 3.43f, 4.75f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.75f, 20.57f, 5.42f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(15.0f)
                curveTo(18.58f, 21.25f, 19.25f, 20.57f, 19.25f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(19.25f, 3.43f, 18.58f, 2.75f, 15.0f, 2.75f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.25f)
                horizontalLineTo(10.0f)
                curveTo(9.59f, 6.25f, 9.25f, 5.91f, 9.25f, 5.5f)
                curveTo(9.25f, 5.09f, 9.59f, 4.75f, 10.0f, 4.75f)
                horizontalLineTo(14.0f)
                curveTo(14.41f, 4.75f, 14.75f, 5.09f, 14.75f, 5.5f)
                curveTo(14.75f, 5.91f, 14.41f, 6.25f, 14.0f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 19.86f)
                curveTo(10.7302f, 19.86f, 9.7002f, 18.83f, 9.7002f, 17.56f)
                curveTo(9.7002f, 16.29f, 10.7302f, 15.26f, 12.0002f, 15.26f)
                curveTo(13.2702f, 15.26f, 14.3002f, 16.29f, 14.3002f, 17.56f)
                curveTo(14.3002f, 18.83f, 13.2702f, 19.86f, 12.0002f, 19.86f)
                close()
                moveTo(12.0002f, 16.75f)
                curveTo(11.5602f, 16.75f, 11.2002f, 17.11f, 11.2002f, 17.55f)
                curveTo(11.2002f, 17.99f, 11.5602f, 18.35f, 12.0002f, 18.35f)
                curveTo(12.4402f, 18.35f, 12.8002f, 17.99f, 12.8002f, 17.55f)
                curveTo(12.8002f, 17.11f, 12.4402f, 16.75f, 12.0002f, 16.75f)
                close()
            }
        }
        .build()
        return _mobile!!
    }

private var _mobile: ImageVector? = null
